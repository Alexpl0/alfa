document.addEventListener('DOMContentLoaded', function() {
    fetch('http://localhost:8080/alumnos')
        .then(response => response.json())
        .then(data => {
            const alumnosList = document.getElementById('alumnos-list');
            data.forEach(alumno => {
                const listItem = document.createElement('li');
                listItem.textContent = `${alumno.id}: ${alumno.nombre}`;
                alumnosList.appendChild(listItem);
            });
        })
        .catch(error => console.error('Error fetching data:', error));
});