using HelloUser.Models;
using Microsoft.AspNetCore.Mvc;

namespace HelloUser.Controllers
{
    [Route("api")]
    public class RestController
    {
        [HttpGet("greeting")]
        public Greeting Greet(string name)
        {
            //return new Greeting(1, "Hello, " + name);
            return new Greeting(1, $"Hello, {name}");
        }
    }
}