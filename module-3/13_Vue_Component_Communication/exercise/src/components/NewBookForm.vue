<template>
    <div>
      <form class="new-book-form" v-on:submit.prevent="saveBook">
        <input class="title-input" type="text" placeholder="Title">
        <input class="author-input" type="text" placeholder="Author">
        <input class="isbn-input" type="text" placeholder="ISBN:">
        <button type="submit" value="Save" v-bind:click="saveBook"></button>
      </form>
    </div>
</template>
<script>
export default {
  methods: {
    
  
    saveBook(event) {
        this.$store.commit('ADD_BOOK', this.newBook);
        this.resetForm();
      },
  }      
    
}
</script>