const bookName = 'Cigar Parties for Dummies';
let description = 'Host and plan the perfect cigar party for all of your squirrelly friends.';
let reviews = [
  {
    reviewer: 'Malcolm Madwell',
    title: 'What a book!',
    review:
    "It certainly is a book. I mean, I can see that. Pages kept together with glue and there's writing on it, in some language. Yes indeed, it is a book!",
    rating: 3
  }
];

/**
 * Add product name to the page title.
 */
function setPageTitle() {
  document.querySelector('span.name').innerText = bookName;
}

/**
 * Add product description to the page.
 */
function setPageDescription() {
  document.querySelector('.description').innerText = description;
}

/**
 * Display all of the reviews in the reviews array.
 */
function displayReviews() {
  reviews.forEach((review) => {
    displayReview(review);
  });
}

/**
 * Add single review to the page.
 *
 * @param {Object} review The review to display
 */
function displayReview(review) {
  const main = document.getElementById('main');
  const tmpl = document.getElementById('review-template').content.cloneNode(true);
  tmpl.querySelector('h4').innerText = review.reviewer;
  tmpl.querySelector('h3').innerText = review.title;
  tmpl.querySelector('p').innerText = review.review;
  // there will always be 1 star because it is a part of the template
  for (let i = 1; i < review.rating; ++i) {
    const img = tmpl.querySelector('img').cloneNode();
    tmpl.querySelector('.rating').appendChild(img);
  }
  main.appendChild(tmpl);
}

// LECTURE STARTS HERE ---------------------------------------------------------------

// Set the product reviews page title.
setPageTitle();
// Set the product reviews page description.
setPageDescription();
// Display all of the product reviews on our page.
displayReviews();

/**
 * Hide the description and show the text box.
 *
 * @param {Element} desc the element containing the description
 */
function toggleDescriptionEdit(desc) {
  const textBox = desc.nextElementSibling;
  textBox.value = desc.innerText;
  textBox.classList.remove('d-none');
  desc.classList.add('d-none');
  textBox.focus();
}

/**
 * Hide the text box and show the description.
 * If save is true, also set the description to the contents of the text box.
 *
 * @param {Element} textBox the input element containing the edited description
 * @param {Boolean} save should we save the description text
 */
function exitDescriptionEdit(textBox, save) {
  let desc = textBox.previousElementSibling;
  if (save) {
    desc.innerText = textBox.value;
  }
  textBox.classList.add('d-none');
  desc.classList.remove('d-none');
}

/**
 * Toggle visibility of the add review form.
 */
function showHideForm() {
  // find form
  // find button inside of form

  // if form is hidden
    // unhide the form
    // change button text
    // set focus on the first field
  // else
    // reset the form fields
    // hide the form
    // change button text
}

/**
 * Reset all of the values in the form.
 */
function resetFormValues() {
  // find all inputs and reset values
}

/**
 * Save the review that was added using the add review form.
 */
function saveReview() {}
