package Bean;

public class subway {
private int stop_id;//վ��
private String stop_name;//վ��
private int line_id;//�ߺ�
private String line_name;//����
private int seq;//վ�����е�˳��
private int change;//����
public int getStop_id() {
	return stop_id;
}
public void setStop_id(int stop_id) {
	this.stop_id = stop_id;
}
public String getStop_name() {
	return stop_name;
}
public void setStop_name(String stop_name) {
	this.stop_name = stop_name;
}
public int getLine_id() {
	return line_id;
}
public void setLine_id(int line_id) {
	this.line_id = line_id;
}
public String getLine_name() {
	return line_name;
}
public void setLine_name(String line_name) {
	this.line_name = line_name;
}
public int getSeq() {
	return seq;
}
public void setSeq(int seq) {
	this.seq = seq;
}
public int getChange() {
	return change;
}
public void setChange(int change) {
	this.change = change;
}
public subway() {}
public subway (String stop_name) {
	this.stop_name=stop_name;
}
}
