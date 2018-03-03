package javasaxparser;

import java.util.ArrayList;
import java.util.HashMap;


public class XMLNode {
    public String name;
    public String content;
    public HashMap<String, String> attributes;
    public ArrayList<XMLNode> children;
    public XMLNode() {
    this.attributes = new HashMap();
    this.children = new ArrayList();
    }
}
