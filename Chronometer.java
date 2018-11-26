import java.util.Timer;
import java.util.TimerTask;

public class Chronometer {

	private int secondsAvailable;
	private int seconds = getSecondsAvailable()%60;
	private int minutesAvailable = getSecondsAvailable()%60;
	private int minutes = getMinutesAvailable()/60;

	Timer timer = new Timer(true);
	TimerTask task = new TimerTask() {
		public void run() {
			setSecondsAvailable(getSecondsAvailable() - 1);
		}
	};

	public void start() {

		timer.scheduleAtFixedRate(task, 1000, 1000);

	}
	public Chronometer(){}
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

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getMinutesAvailable() {
		return minutesAvailable;
	}

	public void setMinutesAvailable(int minutesAvailable) {
		this.minutesAvailable = minutesAvailable;
	}

}
