public class SlackTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SlackApi api = new SlackApi("https://hooks.slack.com/services/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");
		SlackAttachment attach = new SlackAttachment();
		attach.setTitle("    ");
		attach.setColor("#CC3D3D");
		attach.setFallback("점검이 필요합니다.");
		attach.setTimestamp(new java.util.Date());
		attach.setText("하위타이틀");
//		attach.setImageUrl("이미지경로");
		api.call(new SlackMessage("아이이", "메세지 타이틀").addAttachments(attach));
	}
}
