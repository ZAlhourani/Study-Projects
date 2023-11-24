<template>
     <section class="review" v-bind:class="{ favorited: review.isFavorite }">
      <h4>{{ review.reviewer }}</h4>
      <div class="rating">
        <img v-bind:title="review.rating + ' star review'" class="ratingStar" v-for="n in review.rating" v-bind:key="n" src="../assets/star.png" alt="Rating Star">
      </div>
      <h3>{{ review.title }}</h3>
      <p>{{ review.review }}</p>
      <label for="chk-favorite">Favorite?</label><input type="checkbox" id="chk-favorite" v-on:change="favoritedChanged()">
    </section>
</template>


<script>

export default{
    props: ['review'],
    

    
}
</script>

<style scoped>
.main {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
.main {
  margin: 1rem 0;
  padding: 0 10rem;
}

.well-display {
  display: flex;
  justify-content: space-around;
  margin-bottom: 1rem;
}

</style>
