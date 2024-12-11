function move({ target }) {
  const actualPosition = parseInt(getComputedStyle(target).left);
  const containerWidth = parseInt(getComputedStyle(document.querySelector("#container")).width);
  const boxWidth = parseInt(getComputedStyle(target).width);
  console.log("batata");

  //Quando a caixa vermelha chega ao final da caixa cinza ela para e volta
  if (actualPosition + boxWidth >= containerWidth) {
    return animateBack(target);
  }

  const newPosition = actualPosition + 1;
  target.style.left = `${newPosition}px`;
  requestAnimationFrame(() => {
    move({ target });
  });
}

function animateBack(target) {
  const actualPosition = parseInt(getComputedStyle(target).left);
  const newPosition = actualPosition - 1;
  target.style.left = `${newPosition}px`;
  requestAnimationFrame(() => {
    if (newPosition > 0) {
      animateBack(target);
    } else {
      // Se a caixa voltou ao início, chama a função move novamente para fazer a caixa se mover para a direita
      //move({ target });
    }
  });
}

box.addEventListener("click", (e) => {
  move(e);
});
