package library;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.YEAR;

/**
 * Edition
 */
public class Edition {
    private String name;
    private String author;
    private Genre genre;
    private int Year;

    Edition() {
        this.genre = Genre.GENERAL;
        this.Year = Calendar.getInstance().get(YEAR);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    public int getYear() {
        return Year;
    }
    public void setYear(int year) {
        this.Year = year;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Edition{");
        sb.append("name='").append(name).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", genre=").append(genre);
        sb.append(", Year=").append(Year);
        sb.append('}');
        return sb.toString();
    }
}
