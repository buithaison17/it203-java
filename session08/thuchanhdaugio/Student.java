package thuchanhdaugio;

class Student {
    private String studentId;
    private String studentName;
    private double score;

    public Student() {

    }

    public Student(String studentId, String studentName, double score) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.score = score;
    }

    // Getter và setter
    public double getScore() {
        return score;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRank() {
        if (score >= 8.0) {
            return "Gioi";
        } else if (score >= 6.5) {
            return "Kha";
        }

        else {
            return "Trung binh";
        }
    }

    @Override
    public String toString() {
        return "ID: " + studentId + ", " + "Ho ten: " + studentName + ", " + "DTB: " + score + ", " + "Xep loai: "
                + getRank();
    }

}
