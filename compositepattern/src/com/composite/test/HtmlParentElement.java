package com.composite.test;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {
	private String tagName;
	private String startTag;
	private String endTag;
	private List<HtmlTag> childrenTag = new ArrayList<>();;

	public HtmlParentElement(String tagName, String startTag, String endTag, List<HtmlTag> childrenTag) {
		this.tagName = tagName;
		this.startTag = startTag;
		this.endTag = endTag;
		this.childrenTag = new ArrayList<>();
	}

	public HtmlParentElement(String tagName) {
		this.tagName = tagName;
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
	public void setBodytag(String tagBody) {
		// TODO Auto-generated method stub
		super.setBodytag(tagBody);
	}

	@Override
	public void addChildTag(HtmlTag htmltag) {
		// TODO Auto-generated method stub
		childrenTag.add(htmltag);
	}

	@Override
	public void removeChildTag(HtmlTag htmltag) {
		// TODO Auto-generated method stub
		childrenTag.remove(htmltag);
	}

	@Override
	public List<HtmlTag> getChildren(HtmlTag htmltag) {
		// TODO Auto-generated method stub
		return childrenTag;
	}

	@Override
	public void generateHtml() {
		System.out.println(startTag);
		for (HtmlTag htmlTag : childrenTag) {
			htmlTag.generateHtml();
		}
		System.out.println(endTag);

	}
}
