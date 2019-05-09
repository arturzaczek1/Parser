package main.xmlParser;

public class CustomDataContent {
	private String attribute;
	private General general;
	private Add add;
	private Change change;
	private Deprecate deprecate;
	private Remove remove;
	private Fix fix;
	private Secure secure;

	public General getGeneral() {
		return general;
	}

	public void setGeneral(General general) {
		this.general = general;
	}

	public Add getAdd() {
		return add;
	}

	public void setAdd(Add add) {
		this.add = add;
	}

	public Change getChange() {
		return change;
	}

	public void setChange(Change change) {
		this.change = change;
	}

	public Deprecate getDeprecate() {
		return deprecate;
	}

	public void setDeprecate(Deprecate deprecate) {
		this.deprecate = deprecate;
	}

	public Remove getRemove() {
		return remove;
	}

	public void setRemove(Remove remove) {
		this.remove = remove;
	}

	public Fix getFix() {
		return fix;
	}

	public void setFix(Fix fix) {
		this.fix = fix;
	}

	public Secure getSecure() {
		return secure;
	}

	public void setSecure(Secure secure) {
		this.secure = secure;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

}
