package data;

public class Job {
	private String job;

	public Job(String job) {
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Job: " + job;
	}

}