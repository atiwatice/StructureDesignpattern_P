package com.composite.test;

public class TestCOmpositePattern {
	public static void main(String[] args) {

		HtmlTag parentTag = new HtmlParentElement("<html>");
		parentTag.setStartTag("<html>");
		parentTag.setEndTag("</html>");

		HtmlTag p1 = new HtmlParentElement("<body>");
		p1.setStartTag("<body>");
		p1.setEndTag("</body>");
		
		HtmlTag p2 = new HtmlParentElement("<body2>");
		p2.setStartTag("<body2>");
		p2.setEndTag("</body2>");

		parentTag.addChildTag(p1);
		parentTag.addChildTag(p2);

		HtmlTag childTag = new HtmlElement("<p>");
		childTag.setStartTag("<p>");
		childTag.setEndTag("</p>");
		childTag.setBodytag("testing this body tag");
		p1.addChildTag(childTag);

		childTag = new HtmlElement("<p>");
		childTag.setStartTag("<p>");
		childTag.setEndTag("</p>");
		childTag.setBodytag("testing paragraph2");
		p1.addChildTag(childTag);
		
		childTag = new HtmlElement("<p>");
		childTag.setStartTag("<p>");
		childTag.setEndTag("</p>");
		childTag.setBodytag("testing paragraphP2");
		p2.addChildTag(childTag);

		parentTag.generateHtml();

	}
}
