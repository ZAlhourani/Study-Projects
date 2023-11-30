<template>
    <div>
        <reading-list></reading-list>
    </div>

    <div>
      <router-link :to="{ name: 'new-book-view' }">Add Book to Reading List</router-link>
    </div>
    
</template>

<script>
import ReadingList from '@/components/ReadingList.vue';

export default {
    components: {
        ReadingList
    }
}
</script>