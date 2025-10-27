const quotes = [
  {
    id: 1,
    text: "The best way to predict the future is to invent it.",
    author: "Alan Kay",
  },
  {
    id: 2,
    text: "Simplicity is the soul of efficiency.",
    author: "Austin Freeman",
  },
  {
    id: 3,
    text: "Continuous improvement is better than delayed perfection.",
    author: "Mark Twain",
  },
  {
    id: 4,
    text: "Programs must be written for people to read, and only incidentally for machines to execute.",
    author: "Harold Abelson",
  },
  {
    id: 5,
    text: "If you automate a mess, you get an automated mess.",
    author: "Rod Michael",
  },
  {
    id: 6,
    text: "First, solve the problem. Then, write the code.",
    author: "John Johnson",
  },
  {
    id: 7,
    text: "Any fool can write code that a computer can understand. Good programmers write code that humans can understand.",
    author: "Martin Fowler",
  },
  {
    id: 8,
    text: "Talk is cheap. Show me the code.",
    author: "Linus Torvalds",
  },
  {
    id: 9,
    text: "Experience is the name everyone gives to their mistakes.",
    author: "Oscar Wilde",
  },
  {
    id: 10,
    text: "Success is the ability to go from one failure to another with no loss of enthusiasm.",
    author: "Winston Churchill",
  },
];

function getRandomQuote() {
  const index = Math.floor(Math.random() * quotes.length);
  return quotes[index];
}
module.exports = {
  quotes,
  getRandomQuote,
};
