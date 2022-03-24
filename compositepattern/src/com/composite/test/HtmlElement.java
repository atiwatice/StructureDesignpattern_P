package com.composite.test;

public class HtmlElement extends HtmlTag {
	private String tagName;
	private String startTag;
	private String endTag;
	private String tagBody;

	public HtmlElement(String tagName) {
		this.tagName = tagName;
	}

	public HtmlElement(String tagName, String startTag, String endTag, String tagBody) {
		this.tagName = tagName;
		this.startTag = startTag;
		this.endTag = endTag;
		this.tagBody = tagBody;
	}

	@Override
	public String getTagName() {
		return tagName;
	}

	@Override
	public void setStartTag(String tag) {
		this.startTag = tag;

	}

	@Override
	public void setEndTag(String tag) {
		this.endTag = tag;

	}

	@Override
	public void generateHtml() {
		System.out.println(startTag + "" + tagBody + "" + endTag);

	}

	@Override
	public void setBodytag(String tagBody) {
		this.tagBody = tagBody;
	}
}
