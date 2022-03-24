package com.composite.test;

import java.util.List;

public abstract class HtmlTag {
	public abstract String getTagName();

	public abstract void setStartTag(String tag);

	public abstract void setEndTag(String tag);

	public abstract void generateHtml();

	public void setBodytag(String tagBody) {
		throw new UnsupportedOperationException("current operation is not supported");
	}

	public void addChildTag(HtmlTag htmltag) {
		throw new UnsupportedOperationException("current operation is not supported for this object");
	}

	public void removeChildTag(HtmlTag htmltag) {
		throw new UnsupportedOperationException("current operation is not supported for this object");
	}

	public List<HtmlTag> getChildren(HtmlTag htmltag) {
		throw new UnsupportedOperationException("current operation is not supported for this object");
	}
}
