<template>
    <nav class="navbar">
        <div class="navbar-menu">
            <ul>
                <a v-for="nav in navegacion" :key="nav.nombre" :href="nav.enlace" class="nav-item">{{ nav.nombre }}</a>
            </ul>
        </div>

    </nav>
</template>

<script setup>
import { ref } from "vue"
const navegacion = ref([
    { id: 1, nombre: 'Educacion', enlace: '#educacion' },
    { id: 2, nombre: 'Experiencia', enlace: '#experiencia' },
    { id: 3, nombre: 'Proyectos', enlace: '#proyectos' },
    { id: 4, nombre: 'Habilidades', enlace: '#habilidades' },
    { id: 5, nombre: 'Intereses', enlace: '#intereses' }
])
</script>

<style scoped>
.navbar {
    background-color: rgb(66, 184, 131);
    color: rgb(26, 26, 26);
    padding: 0.5rem 1rem;
    align-items: center;
    border-radius: 10px;
}

.navbar-item {
    color: rgb(26, 26, 26);
    text-decoration: none;
    margin-right: 1rem;
}

.navbar-menu {
    display: flex;
    justify-content: flex-end;
}

.nav-list {
    list-style: none;
}

a {
    color: rgb(26, 26, 26);
    border: 1px solid;
    border-color: rgb(66, 184, 131, 0.8);
    border-radius: 5px;
    /* Elimina la subrayado de los enlaces y elementos con clase "green" */
    text-decoration: none;
    /* Añade una transición suave para los cambios de estilo */
    transition: 0.4s;
    /* Añade padding alrededor del contenido */
    padding: 5px;
}

a:hover {
    /* Cambia el color de fondo al pasar el mouse sobre un enlace */
    background-color: rgb(66, 184, 131, 0.8);
    filter: drop-shadow(1px 1px 5px azure);
}

@media (max-width: 768px) {
    .navbar-menu {
        display: flex;
        justify-content: flex-end;
        width: 100%;
    }
}
</style>