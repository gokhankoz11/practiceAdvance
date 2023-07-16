package LambdaEncap;

public class Course {


        private String season;
        private String courseName;

        private int avarageScore;
        private int numberofStudents;

    public Course() {
    }

    public Course(String season, String courseName, int avarageScore, int numberofStudents) {
            this.season = season;
            this.courseName = courseName;
            this.avarageScore = avarageScore;
            this.numberofStudents = numberofStudents;
        }

        public String getSeason() {
            return season;
        }

        public void setSeason(String season) {
            this.season = season;
        }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public int getAvarageScore() {
            return avarageScore;
        }

        public void setAvarageScore(int avarageScore) {
            this.avarageScore = avarageScore;
        }

        public int getNumberofStudents() {
            return numberofStudents;
        }

        public void setNumberofStudents(int numberofStudents) {
            this.numberofStudents = numberofStudents;
        }

        @Override
        public String toString() {
            return "Course{" +
                    "season='" + season + '\'' +
                    ", courseName='" + courseName + '\'' +
                    ", avarageScore=" + avarageScore +
                    ", numberofStudents=" + numberofStudents +
                    '}';
        }
    }





