package net;

public class ChatProtocol2 {

	// ID, CHAT, CHATALL, MESSAGE, CHATLIST
	
	
	// Client -> Server  )) ID -> aaa
	// Server -> Client  )) CHATLIST -> aaa;bbb;ccc;ȫ�浿; 
	public static final String ID = "ID";
	
	// Client -> Server  )) CHAT : �޴¾��̵�;�޼���    ex) CHAT : bbb;�����
	// Server -> Client  )) CHAT : �����¾��̵�;�޼���  ex) CHAT : aaa;�����    >> aaa�� bbb����  ����ڰ� ä�ú���
	public static final String CHAT = "CHAT";
	
	// Client -> Server  )) CHATALL:�޼���
	// Server -> Client  )) CHATALL:[�����¾��̵�] �޼���
	public static final String CHATALL = "CHATALL";
	
	
	
	// Client -> Server  )) MESSAGE : �޴¾��̵�;��������    ex) MESSAGE : bbb;�����
	// Server -> Client  )) MESSAGE : �����¾��̵�;��������  ex) MESSAGE : aaa;�����    >> aaa�� bbb����  ����ڰ� ��������
	public static final String MESSAGE = "MESSAGE";
	
	// Server -> Client  )) CHATLIST:aaa;bbb;ccc;ȫ�浿;
	public static final String CHATLIST = "CHATLIST";
	
	public static final String MODE = ":";
	
	

}
