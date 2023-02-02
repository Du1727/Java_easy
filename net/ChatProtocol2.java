package net;

public class ChatProtocol2 {

	// ID, CHAT, CHATALL, MESSAGE, CHATLIST
	
	
	// Client -> Server  )) ID -> aaa
	// Server -> Client  )) CHATLIST -> aaa;bbb;ccc;홍길동; 
	public static final String ID = "ID";
	
	// Client -> Server  )) CHAT : 받는아이디;메세지    ex) CHAT : bbb;밥먹자
	// Server -> Client  )) CHAT : 보내는아이디;메세지  ex) CHAT : aaa;밥먹자    >> aaa가 bbb에게  밥먹자고 채팅보냄
	public static final String CHAT = "CHAT";
	
	// Client -> Server  )) CHATALL:메세지
	// Server -> Client  )) CHATALL:[보내는아이디] 메세지
	public static final String CHATALL = "CHATALL";
	
	
	
	// Client -> Server  )) MESSAGE : 받는아이디;쪽지내용    ex) MESSAGE : bbb;밥먹자
	// Server -> Client  )) MESSAGE : 보내는아이디;쪽지내용  ex) MESSAGE : aaa;밥먹자    >> aaa가 bbb에게  밥먹자고 쪽지보냄
	public static final String MESSAGE = "MESSAGE";
	
	// Server -> Client  )) CHATLIST:aaa;bbb;ccc;홍길동;
	public static final String CHATLIST = "CHATLIST";
	
	public static final String MODE = ":";
	
	

}
