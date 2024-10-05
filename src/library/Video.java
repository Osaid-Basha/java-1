package library;

public  class Video extends LibraryItem {
    private String format;

    public Video(String title, String author, String publish_date, String summary, String format) {
        super(title, author, publish_date, summary);
        this.format = format;
    }

    @Override
    public void borrowItem() {
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("The video \"" + getTitle() + "\" has been borrowed.");
        } else {
            System.out.println("The video \"" + getTitle() + "\" is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("The video \"" + getTitle() + "\" has been returned.");
        } else {
            System.out.println("The video \"" + getTitle() + "\" was not borrowed.");
        }
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}

