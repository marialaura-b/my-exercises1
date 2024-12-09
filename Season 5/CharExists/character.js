function characterExists(str, charactere) {
  
    for (i = 0; i < str.length; i++) {
        if (str[i] === charactere) {
            return true; 
        }
    }
    return false;
}

console.log(characterExists("Maria", "a")); 
console.log(characterExists("Maria", "z"));
console.log(characterExists("hello world", " "));
console.log(characterExists("12345", "3"));
console.log(characterExists("12345", "9"));