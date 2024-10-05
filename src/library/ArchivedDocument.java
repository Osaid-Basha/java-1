package library;

public  class ArchivedDocument extends LibraryItem {
    private String archiveNumber;



    public ArchivedDocument(String title, String author, String publish_date, String summary, String archiveNumber) {
        super(title, author, publish_date, summary);
        this.archiveNumber = archiveNumber;
    }

    @Override
    public void borrowItem() {
        System.out.println("The archived document \"" + getTitle() + "\" cannot be borrowed.");
    }

    @Override
    public void returnItem() {
        System.out.println("The archived document \"" + getTitle() + "\" was never borrowed.");
    }

    public String getArchiveNumber() {
        return archiveNumber;
    }

    public void setArchiveNumber(String archiveNumber) {
        this.archiveNumber = archiveNumber;
    }
}

