public class Demo17LoopHourAndMinute {
	public static void main(String[] args) {
		for (int hour = 0; hour < 24; hour++) {  // 第一层循环控制小时 
			for (int minute = 0; minute < 60; minute++) { // 第二层循环控制分钟
				for (int second = 0; second < 60; second++) { // 第三层循环控制秒
					System.out.println(hour + "点" + minute + "分" + second + "秒");
				}
			}
		}
	}
}