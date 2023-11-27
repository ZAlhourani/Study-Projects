<template>

    <div>
    <review-display review="reviewObj" v-for="reviewObj in filteredList" v-bind:key="reviewObj.id"></review-display>
    </div>

</template>

<script>

import ReviewDisplay from './ReviewDisplay.vue';

export default {

    components: {
        ReviewDisplay
    },

    computed: {
        filteredList() {
      return this.$store.state.reviews.filter(review => {
        if (review.rating === this.$store.state.ratingFilter || this.$store.state.ratingFilter === 0) {
          return true;
        }
        return false;
      });
    },
    }
}

</script>

<style scoped>

.favorited {
  background-color: lightyellow;
}

.rating {
  height: 2rem;
  display: inline-block;
  vertical-align: top;
  margin: 0 0.5rem;
}

.rating img {
  height: 100%;
}

.review {
  border: 1px black solid;
  border-radius: 6px;
  padding: 1rem;
  margin: 10px;
}
.review p {
  margin: 20px;
}

.review h3 {
  display: inline-block;
}

.review h4 {
  font-size: 1rem;
}


</style>