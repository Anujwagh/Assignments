document.getElementById("loadBtn").addEventListener("click", function () {
  fetch("Text.txt")
    .then(response => {
      if (!response.ok) {
        throw new Error("Network response was not OK");
      }
      return response.text();
    })
    .then(data => {
      document.getElementById("output").innerText = data;
    })
    .catch(error => {
      console.error("Fetch error:", error);
    });
});
