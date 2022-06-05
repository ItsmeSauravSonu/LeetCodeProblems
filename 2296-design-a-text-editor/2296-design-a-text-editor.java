class TextEditor {
StringBuilder res;
    int pos=0;
    
    public TextEditor() {
        res = new StringBuilder();
    }
    
    public void addText(String text) {
        res.insert(pos,text);
        pos += text.length();
    }
    
    public int deleteText(int k) {
        int tmp = pos;
        pos -= k;
        if(pos<0) pos=0;
        res.delete(pos,tmp);
        return tmp-pos;
    }
    
    public String cursorLeft(int k) {
        int tmp = pos;
        pos-=k;
        if(pos<0) pos = 0;
        if(pos<10) return res.substring(0,pos);
        return res.substring(pos-10,pos);
    }
    
    public String cursorRight(int k) {
        int tmp = pos;
        pos+=k;
        if(pos>res.length()) pos = res.length();
        if(pos<10) return res.substring(0,pos);
        return res.substring(pos-10,pos);


    }}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */