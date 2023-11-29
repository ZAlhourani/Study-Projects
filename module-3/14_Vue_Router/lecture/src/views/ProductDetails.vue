<template>
    <div>
        <p v-if="product === undefined">Product Not Found</p>
        <div v-else>
            <nav class="actions">
                <router-link :to="{ name: 'home-page' }">Back Home</router-link>
                |
                <router-link :to="{ name: 'add-review', params: { id: product.id } }">Add Review</router-link>
            </nav>
            <h1>{{ product.name }}</h1>
            <p class="description">{{ product.description }}</p>
            <div class="well-display">
                <average-summery :reviews="product.reviews"></average-summery>
                <star-summery :reviews="product.reviews" :rating="n" v-for="n in 5" :key="n"></star-summery>
            </div>
            <review-list :reviews="product.reviews"></review-list>
        </div>
    </div>
</template>

<script>

import AverageSummery from '@/components/AverageSummary.vue';
import StarSummery from '@/components/StarSummary.vue';
import ReviewList from '@/components/ReviewList.vue';
import { RouterLink } from 'vue-router';

    export default {
        components: {
    AverageSummery,
    StarSummery,
    RouterLink
},

        computed: {
            product() {
            const currId = Number(this.$route.params.id);
             return this.$store.state.products.find(p => p.id === currId);
            }
        }
    }
</script>