using System;

namespace HelloUser.Models
{
    public class Greeting
    {

        public static long Id { get; set; }
        public string Content { get; set; }
        public Greeting(string content)
        {

            this.Content = content;
            Id++;

        }
    }
}