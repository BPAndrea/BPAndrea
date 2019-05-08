using System;

class BlogPost
{
    public string AuthorName { get; set; }
    public string Title { get; set; }
    public string Text { get; set; }
    public DateTime PublicationDate { get; }

    public BlogPost(string AuthorName, string Title, string Text, DateTime PublicationDate)
    {
        this.AuthorName = AuthorName;
        this.Title = Title;
        this.Text = Text;
        this.PublicationDate = PublicationDate;
    }

    public void PrintPostFields()
    {
        string output = string.Format("Authorname: {0}, Title: {1}, Publication: {2}, Text: {3}", AuthorName, Title, PublicationDate, Text);
        System.Console.WriteLine(output);
    }

}