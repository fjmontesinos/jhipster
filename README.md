# Prácticas realizadas con Jhipster

Colección de prácticas realizadas con Jhipster en el aprendizaje de esta tecnología

# Clonar solo el proyecto que te pueda interesar con sparse-checkout

Si te interesa alguna de las prácticas de este repositorio me parece estupendo !! Si solo deseas clonar esa práctica concreta que te interesa lo tienes realmente sencillo utilizando la característica *sparse-checkout* de git.

Supongamos que tan solo deseas clonar la carpeta prueba-sparse-checkout que como puedes comprobar tan solo tiene un fichero de texto sin código alguno a modo de prueba.

Tan solo debes seguir los siguientes sencillos pasos:

1. Crea un carpeta y accede a ella.

```bash
$ mkdir miproyecto
$ cd miproyecto
```

2. Inicializa un repositorio git en la carpeta.

```bash
$ git init
```

3. Activa sparse-checkout en el repositorio.

```bash
$ git config core.sparsecheckout true
```

4. Indícale a git la carpeta o carpetas que desas clonar de forma exclusiva, para el caso del ejemplo: prueba-sparse-checkout

```bash
$ echo prueba-sparse-checkout >> .git/info/sparse-checkout
```

5. Añade el repositorio remoto a git

```bash
$ git remote -f origin https://github.com/fjmontesinos/jhipster.git
```

6. Haz un pull del proyecto y ejecuta un ls, comprobarás que tan solo se ha clonado la carpeta indicada
```bash
$ git pull origin master
$ ls -la
total 16
drwxrwxr-x 4 javiermontesinos javiermontesinos 4096 abr 10 05:49 .
drwxrwxr-x 8 javiermontesinos javiermontesinos 4096 abr 10 05:59 ..
drwxrwxr-x 8 javiermontesinos javiermontesinos 4096 abr 10 05:49 .git
drwxrwxr-x 2 javiermontesinos javiermontesinos 4096 abr 10 05:49 prueba-sparce-checkout
```


