using System;

namespace HelloUser.Models
{
    public class Greeting
    {
        public Greeting(long id, string content)
        {
            this.Id = id;
            this.Content = content;

        }
        public long Id { get; set; }
        public string Content { get; set; }
    }
}