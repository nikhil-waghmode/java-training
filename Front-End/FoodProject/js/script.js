function loadPage(page) {
    console.log('Loading page:', page);  // Debugging line

    fetch(page)
        .then(response => response.text())
        .then(data => {
            document.getElementById('main-content').innerHTML = data;
        })
        .catch(err => {
            document.getElementById('main-content').innerHTML = '<p class="text-danger">Failed to load content.</p>';
        });
}
