using Microsoft.AspNetCore.Mvc;

namespace firstapi.Controllers
{
    public class PersonConroller : Controller
    {

        public string Index()
        {
            return "Hello PersonController!";
        }
    }
}