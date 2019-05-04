using HelloWorldApp.Models;
using Microsoft.AspNetCore.Mvc;

namespace HelloWorldApp.Controllers
{
    [Route("api")]
    public class RestController : Controller
    {
        [HttpGet("greeting")]
        public Greeting Greet()
        {
            return new Greeting(1, "Hello World!");
        }
    }
}