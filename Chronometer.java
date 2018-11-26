import java.util.Timer;
import java.util.TimerTask;

public class Chronometer {

	private int secondsAvailable;

	Timer timer = new Timer(true);
	TimerTask task = new TimerTask() {
		public void run() {
			setSecondsAvailable(getSecondsAvailable() - 1);
		}
	};

	public void start() {

		timer.scheduleAtFixedRate(task, 1000, 1000);

	}
	
	public Chronometer(int level) {

		if (level == 1) {
			setSecondsAvailable(300);
		} else
			setSecondsAvailable(180);

		start();
	}


	public int getSecondsAvailable() {
		return secondsAvailable;
	}

	public void setSecondsAvailable(int secondsAvailable) {
		this.secondsAvailable = secondsAvailable;
	}


}
