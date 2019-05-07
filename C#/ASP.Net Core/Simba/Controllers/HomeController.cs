using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Simba.Models;

namespace Simba.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
        [HttpGet("show")]
        public IActionResult Show()
        {
            BankAccount first = new BankAccount()
            {
                Name = "Simba",
                Balance = 2000,
                AnimalType = "lion",
                Currency = "Zebra"
            };
            return View(first);
        }

        [HttpGet("html")]
        public String Html()
        {
            string htmlText = "This is an <em>HTML</em> text.<b>Enjoy yourself!<b>";

            return htmlText;
        }

        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
