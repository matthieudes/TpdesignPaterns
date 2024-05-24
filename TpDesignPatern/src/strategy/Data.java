package strategy;

import java.util.List;

public class Data {
    private String format;
    private String content;

    public Data(String format, String content) {
        this.format = format;
        this.content = content;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
