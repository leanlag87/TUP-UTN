<script setup>//componente de habilidades
import html from '/src/components/icons/html.svg'
import css from '/src/components/icons/css.svg'
import js from '/src/components/icons/js.svg'
import java from '/src/components/icons/java.svg'
import py from '/src/components/icons/python.svg'
import vue from '/src/components/icons/vue.svg'
import react from '/src/components/icons/react.svg'
import node from '/src/components/icons/node.svg'
import express from '/src/components/icons/express.svg'
import bootstrap from '/src/components/icons/bootstrap.svg'
import mongo from '/src/components/icons/mongo.svg'
import sql from '/src/components/icons/mysql.svg'
import git from '/src/components/icons/git.svg'
import github from '/src/components/icons/github_icon.svg'
import vsc from '/src/components/icons/vscode.svg'
import esp from '/src/components/icons/arg.svg'
import ing from '/src/components/icons/usa.svg'

import { ref } from 'vue' // Importamos ref de vue para crear una referencia reactiva

const habilidades = ref([
    {
        id: 1,
        nombre: 'Leanguajes de Programacion',
        habilidades: [
            {
                id: 1,
                nombre: 'HTML',
                nivel: 'Intermedio',
                icono: html,
            },
            {
                id: 2,
                nombre: 'CSS',
                nivel: 'Intermedio',
                icono: css,
            },
            {
                id: 3,
                nombre: 'JavaScript',
                nivel: 'Intermedio',
                icono: js,
            },
            {
                id: 4,
                nombre: 'Java',
                nivel: 'Basico',
                icono: java,
            },
            {
                id: 5,
                nombre: 'Python',
                nivel: 'Basico',
                icono: py,
            },
        ]
    },
    {
        id: 2,
        nombre: 'Frameworks y Librerias',
        habilidades: [
            {
                id: 1,
                nombre: 'Vue.js',
                nivel: 'Intermedio',
                icono: vue,
            },
            {
                id: 2,
                nombre: 'React.js',
                nivel: 'Intermedio',
                icono: react,
            },
            {
                id: 3,
                nombre: 'Node.js',
                nivel: 'Intermedio',
                icono: node,
            },
            {
                id: 4,
                nombre: 'Express.js',
                nivel: 'Intermedio',
                icono: express,
            },
            {
                id: 5,
                nombre: 'Bootstrap',
                nivel: 'Intermedio',
                icono: bootstrap,
            },
        ]
    },
    {
        id: 3,
        nombre: 'Bases de Datos',
        habilidades: [
            {
                id: 1,
                nombre: 'MongoDB',
                nivel: 'Intermedio',
                icono: mongo,
            },
            {
                id: 2,
                nombre: 'SQL',
                nivel: 'Basico',
                icono: sql,
            },
        ]
    },
    {
        id: 4,
        nombre: 'Herramientas y Software',
        habilidades: [
            {
                id: 1,
                nombre: 'Git',
                nivel: 'Intermedio',
                icono: git,
            },
            {
                id: 2,
                nombre: 'GitHub',
                nivel: 'Intermedio',
                icono: github,
            },
            {
                id: 3,
                nombre: 'Visual Studio Code',
                nivel: 'Intermedio',
                icono: vsc,
            },
        ]
    },
    {
        id: 5,
        nombre: 'Idiomas',
        habilidades: [
            {
                id: 1,
                nombre: 'Español',
                nivel: 'Nativo',
                icono: esp,
            },
            {
                id: 2,
                nombre: 'Ingles',
                nivel: 'basico',
                icono: ing,
            },
        ]
    },

])
</script>

<template>
    <div class="skills-contenedor">
        <div v-for="habilidad in habilidades" :key="habilidad.id" class="skills-categoria">
            <h3>{{ habilidad.nombre }}</h3>
            <ul class="skills">
                <li v-for="habilidad in habilidad.habilidades" :key="habilidad.id" class="skill">
                    <img :src="habilidad.icono" :alt="habilidad.nombre" />
                    <span>{{ habilidad.nombre }}: {{ habilidad.nivel }}</span>

                </li>
            </ul>
        </div>

    </div>

</template>

<style scoped>
.skills-contenedor {
    display: flex;
    flex-wrap: wrap;
    justify-content: space-around;
    margin-top: 2rem;
}

.skills-categoria {
    width: 300px;
    margin: 1rem;
    padding: 1rem;
    border-radius: 5px;
    background-color: rgb(26, 26, 26);
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    filter: drop-shadow(1px 1px 5px rgb(66, 184, 131));
    cursor: pointer;
}

.skills-categoria h3 {
    color: azure;
    text-align: center;
}

.skills {
    list-style: none;
    padding: 0;
}

.skill {
    display: flex;
    align-items: center;
    gap: 10px;
    margin: 10px 0;
}

.skill img {
    width: 30px;
    height: 30px;
}

.skill span {
    color: azure;
}
</style>
