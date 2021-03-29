
public class Jogo {
	
	private Time time1;
	private Time time2;
	
	public Jogo(Time time1, Time time2) {
		this.time1 = time1;
		this.time2 = time2;
	}

	public Time getTime1() {
		return time1;
	}

	public Time getTime2() {
		return time2;
	}
	
	public boolean foiEmpate() {
		return time1.getGols() == time2.getGols();
	}
	
	public boolean time1VenceuJogo() {
		return time1.getGols() > time2.getGols();
	}
	
	public boolean time2VenceuJogo() {
		return time2.getGols() > time1.getGols();
	}

}
