<template>
  <div class="main">
    <h1>Product Reviews for {{ $store.state.name }}</h1>
    <p>{{ $store.state.description }}</p>

    <div class="well-display">

      <average-rating></average-rating>

      <!-- <Star-Rating v-bind:ratingValue="1"></Star-Rating>
      <Star-Rating v-bind:rating-value="2"></Star-Rating>
      <Star-Rating v-bind:rating-value="3"></Star-Rating>
      <Star-Rating v-bind:rating-value="4"></Star-Rating>
      <Star-Rating v-bind:rating-value="5"></Star-Rating> -->
      <!-- //or we can do it this way in a loop -->
      <star-rating v-for="n in 5" :key="n" :rating-value="n"></star-rating>
     
     
    </div>

    <add-review></add-review>
    <review-list></review-list>

  </div>
</template>

<script>

import AverageRating from './components/AverageRating.vue';
import StarRating from './components/StarRating.vue';
import AddReview from './components/AddReview.vue';
import ReviewList from './components/ReviewList.vue';

export default {

  components: {
   AverageRating,
   StarRating,
   AddReview,
   ReviewList

  },


    computed: {
   

    getShowHideFormText() {
      if (this.isFormShowing) {
        return 'Hide Form';
      }

      return 'Show Form';
    },

    

  },

  data() {
    return {
      selectAllCheckbox: false,

      selectedCheckboxes: [],

      names: ['Walt', 'Tom', 'Jennifer', 'Julie'],
      someObj: {
        myText: '',
        selectedValue: "2"
      },


      
      reviews: [{
        id: 1,
        reviewer: 'Tom Anderson',
        title: 'Great Book!',
        rating: 5,
        review: 'This was a really good breakdown of OOP',
        isFavorite: false
      },
      {
        id: 2,
        reviewer: 'Walt Impellicceiri',
        title: 'It was okay',
        rating: 3,
        review: 'Could use some updating',
        isFavorite: true
      }
      ],
      
      
      ratingFilter: 0
    };
  },

  methods: {
    numberOfStarReviews(rating) {
      return this.reviews.filter(review => review.rating === rating).length;
    },

    starReviewText(rating) {
      if (this.numberOfStarReviews(rating) === 1) {
        return `${rating} Star Review`;
      }

      return `${rating} Star Reviews`;
    },

 
    

    updateFilter(newValue) {
      this.ratingFilter = newValue;
    },

    selectAllChanged(event) {
      const selectAllCheckbox = event.currentTarget;

      if (selectAllCheckbox.checked) {
        // check all the boxes
        this.selectedCheckboxes = [];
        this.names.forEach(name => {
          this.selectedCheckboxes.push(name);
        });
        
      } else {
        // uncheck all the boxes
        this.selectedCheckboxes = [];
      }
    }
  }
};
</script>

