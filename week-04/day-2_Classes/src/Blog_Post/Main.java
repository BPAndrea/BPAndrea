package Blog_Post;
/*Create a BlogPost class that has
    an authorName
    a title
    a text
    a publicationDate*/
 /*Create a Blog class which can
    store a list of BlogPosts
    add BlogPosts to the list
    delete(int) one item at given index
    update(int, BlogPost) one item at the given index and update it with another BlogPost*/

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    BlogPost blogPost1 = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
    BlogPost blogPost2 = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
    BlogPost blogPost3 = new BlogPost();
    blogPost3.authorName = "William Turton";
    blogPost3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    blogPost3.date = "2017.03.28.";
    blogPost3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.\n" +
        "        When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really\n" +
        "        into the whole organizer profile thing";

    System.out.println(blogPost1.authorName + ", " + blogPost1.text);
    System.out.println(blogPost2.authorName + ", " + blogPost2.text);

    ArrayList<BlogPost> blogPostsInMain = new ArrayList<>();
    blogPostsInMain.add(blogPost1);
    blogPostsInMain.add(blogPost2);
    blogPostsInMain.add(blogPost3);

    Blog blogInMain = new Blog(blogPostsInMain);

    //Testing creating Blog:
    System.out.println(blogInMain.blogPosts.size());
    for (int i = 0; i < blogInMain.blogPosts.size(); i++) {
      System.out.println(blogInMain.blogPosts.get(i).authorName);
    }

    //Testing delete(int):
    blogInMain.delete(1);
    System.out.println(blogInMain.blogPosts.size());
    for (int i = 0; i < blogInMain.blogPosts.size(); i++) {
      System.out.println(blogInMain.blogPosts.get(i).authorName);
    }

    //Testing  update(int, BlogPost):
    blogInMain.update(0, blogPost3);
    System.out.println(blogInMain.blogPosts.size());
    for (int i = 0; i < blogInMain.blogPosts.size(); i++) {
      System.out.println(blogInMain.blogPosts.get(i).authorName);
    }

  }
}

