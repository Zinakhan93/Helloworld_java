import java.util.Objects;

public class Аuthor {
    private String firsname;
    private String lasname;


    public Аuthor(String firsname, String lasname) {
        this.firsname = firsname;
        this.lasname = lasname;
    }

    public String getFirsname() {
        return firsname;
    }


    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public String getLasname() {
        return lasname;
    }

    public void setLasname(String lasname) {
        this.lasname = lasname;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Аuthor аuthor = (Аuthor) o;
        return Objects.equals(firsname, аuthor.firsname) && Objects.equals(lasname, аuthor.lasname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firsname, lasname);
    }

    @Override
    public String toString() {
        return "Аuthor{" +
                "firsname='" + firsname + '\'' +
                ", lasname='" + lasname + '\'' +
                '}';
    }
}
