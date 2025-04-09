<script setup>
import icon1 from "/src/components/icons/dev-svgrepo-com.svg"
import icon2 from "/src/components/icons/dev-svgrepo-com.svg"
import icon3 from "/src/components/icons/dev-svgrepo-com.svg"

import { ref } from 'vue';
const titulo = "Desarrollador Full Stack";
const fecha = "Enero 2023 - Actualmente";
const experiencia = ref([
    { id: 1, src: icon1, empresa: 'Open Boot Camp:', parrafo: 'Desarrollo de diferentes aplicaciones Web, usando diferentes tecnologias', fecha: 'Enero 2023 - Julio 2023' },
    { id: 2, src: icon2, empresa: 'DevSchool:', parrafo: 'Desarrollo de aplicaciones Web Full Stack, usando el Stack MERN', fecha: 'Julio 2023 - Marzo 2024' },
    { id: 3, src: icon3, empresa: 'UTN:', parrafo: 'Trabajo en equipo desarrollando diferentes tareas de programacion con diferentes roles', fecha: 'Marzo 2024 - Actual' },
])
</script>

<template>
    <div class="card">
        <h3 class="titulo"> {{ titulo.toLocaleUpperCase() }} </h3>
        <p class="fecha"> {{ fecha }} </p>
        <ul class="listado">
            <li class="item" v-for="exp in experiencia" :key="exp.id">
                <div class="cont">
                    <img class="imagen-svg" :src="exp.src" width="45rem" alt="logo" />
                    <p>
                        {{ exp.empresa }}
                        {{ exp.parrafo }}
                    </p>
                    <time>{{ exp.fecha }}</time>
                </div>
            </li>
        </ul>

    </div>

</template>

<style scoped>
.card {
    display: flex;
    flex-direction: column;
    background-color: rgb(66, 184, 131);
    padding: 1rem;
    border-radius: 10px;
    margin: 1rem;
    cursor: pointer;
}

.titulo {
    color: rgb(26, 26, 26);
    font-size: 1.5rem;
    margin-bottom: 0.5rem;
}

.fecha {
    color: rgb(26, 26, 26);
    font-size: 1rem;
    margin-bottom: 1rem;
}

.listado {
    display: flex;
    flex-direction: column;
    list-style: none;
    padding: 0;
    margin: 0;
}

.item {
    align-items: center;
    display: flex;
    background-color: rgb(26, 26, 26);
    padding: 1rem;
    border-radius: 10px;
    margin-bottom: 1rem;
    transition: all 0.3s;

    &:hover {
        transform: scale(1.05);
    }


}

.cont {
    display: flex;
    align-items: center;
    justify-content: space-between;
    width: 100%;
}

.imagen-svg {
    margin-right: 1rem;
}

h3 {
    color: #333;
    font-size: 1.2rem;
    margin-bottom: 0.5rem;
}

p {
    color: azure;
    font-size: 1rem;
    margin-bottom: 0.5rem;
}

time {
    color: azure;
    font-size: 0.8rem;
    margin-bottom: 0.5rem;
}
</style>