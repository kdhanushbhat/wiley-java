package assignments;

public class Student {
	int id;
	String name;
	int qsolved;
	int score;

	
	public Student(int id,
	String name,
	int qsolved,
	int score) {
		this.id = id;
		this.name = name;
		this.qsolved = qsolved;
		this.score = score;

	}
	
	@Override
	public String toString() {
		return "Name: "+this.name+"\tID: "+this.id+"\nQuestion Solved: "+this.qsolved+"\tScore: "+this.score;
	}
	
	int getId() {
		return this.id;
	}
	
	String getName() {
		return this.name;
	}
	
	int getScore() {
		return this.score;
	}
	
	int getQSolved() {
		return this.qsolved;
	}

	void setId(int id) {
		this.id = id;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setScore(int score) {
		this.score = score;
	}
	
	void setQSolved(int qsolved) {
		this.qsolved = qsolved;
	}
	
	
}
