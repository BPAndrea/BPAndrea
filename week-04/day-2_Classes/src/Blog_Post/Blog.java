package Blog_Post;

import java.util.ArrayList;

/*Reuse your BlogPost class
      Create a Blog class which can
          store a list of BlogPosts
          add BlogPosts to the list
          delete(int) one item at given index
          update(int, BlogPost) one item at the given index and update it with another BlogPost*/
public class Blog {
  ArrayList<BlogPost> blogPosts;

  Blog(ArrayList<BlogPost> inputBlogPosts){
    this.blogPosts=inputBlogPosts;
  }

  public void delete(int index) {
    blogPosts.remove(index);
  }

  public void update (int index, BlogPost blogPostToAdd){
    //blogPosts.remove(index);
    //blogPosts.add(index, blogPostToAdd);

    blogPosts.set(index, blogPostToAdd);
  }
}
