package main;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import main.xmlParser.CustomDataContent;
import resultFile.ResultFile;

public class ResultFileParser {

	public String getResultFile() {

		ResultFileParser rfp = new ResultFileParser();
		ResultFile rf = rfp.parseToResultFile();
		StringBuilder resultString = new StringBuilder();

		resultString.append("\\section*{");
		resultString.append(rf.getDateResult() + "}\n");
		resultString.append(rfp.surroundListWithItemize(rf.getAddedResult(), "ADDED"));
		resultString.append(rfp.surroundListWithItemize(rf.getChangedResult(), "CHANGED"));
		resultString.append(rfp.surroundListWithItemize(rf.getDeprecatedResult(), "DEPRECATED"));
		resultString.append(rfp.surroundListWithItemize(rf.getRemovedResult(), "REMOVED"));
		resultString.append(rfp.surroundListWithItemize(rf.getFixedResult(), "FIXED"));
		resultString.append(rfp.surroundListWithItemize(rf.getSecurityResult(), "SECURITY"));
		return resultString.toString();
	}

	public String getFileName() {
		ResultFileParser rfp = new ResultFileParser();
		ResultFile rf = rfp.parseToResultFile();
		return (rf.getDateResult().replaceAll("[-]", "") + ".tex");
	}

	private ResultFile parseToResultFile() {
		ContentDao content = new ContentDao();
		CustomDataContent cdc = content.readXML();
		ResultFile rf = new ResultFile();
		rf.setDateResult(cdc.getGeneral().getLogDate());
		rf.setAddedResult((setItemList(cdc.getAdd().getAddedList().get(0))));
		rf.setChangedResult((setItemList(cdc.getChange().getChangedList().get(0))));
		rf.setDeprecatedResult((setItemList(cdc.getDeprecate().getDeprecateList().get(0))));
		rf.setRemovedResult((setItemList(cdc.getRemove().getRemovedList().get(0))));
		rf.setFixedResult((setItemList(cdc.getFix().getFixedList().get(0))));
		rf.setSecurityResult((setItemList(cdc.getSecure().getSecureList().get(0))));
		return rf;
	}

	private String urlDecoder(String url) {
		String result = null;
		try {
			result = java.net.URLDecoder.decode(url, Charset.forName("UTF-8").name());
		} catch (UnsupportedEncodingException e) {
			e.getStackTrace();
		}
		return result;
	}

	private String deleteHtmlMarkups(String url) {
		return url.replaceAll("(<ol>)|(<div>)|(<\\/ol>)|(<\\/div>)|(<b>)|(<\\/b>)|(<li>)", "");
	}

	private List<String> setItemList(String urlCode) {
		String url = deleteHtmlMarkups(urlDecoder(urlCode));
		String arr[] = url.split("(<\\/li>)");
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		list.remove(list.size() - 1);
		return list;
	}

	private String surroundListWithItemize(List<String> listOfString, String header) {
		StringBuilder sb = new StringBuilder();
		if (listOfString != null && listOfString.size() != 0) {
			sb.append("\\subsection*").append("{" + header + "}").append("\n").append("\\begin{itemize}\n");
			listOfString.forEach(a -> sb.append("\\item ").append(a + "\n"));
			sb.append("\\end{itemize}\n\n");
			return sb.toString();
		} else
			return sb.append("\\subsection*").append("{" + header + "}").append("\n").append("\\begin{itemize}\n")
					.append("\\item \\emph{brak zmian}\n").append("\\end{itemize}\n\n").toString();
	}
}
