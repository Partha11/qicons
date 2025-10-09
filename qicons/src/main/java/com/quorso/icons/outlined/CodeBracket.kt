package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.CodeBracket: ImageVector
    get() {
        if (_CodeBracket != null) {
            return _CodeBracket!!
        }
        _CodeBracket = ImageVector.Builder(
            name = "Outlined.CodeBracket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.25f, 6.75f)
                lineTo(22.5f, 12f)
                lineToRelative(-5.25f, 5.25f)
                moveToRelative(-10.5f, 0f)
                lineTo(1.5f, 12f)
                lineToRelative(5.25f, -5.25f)
                moveToRelative(7.5f, -3f)
                lineToRelative(-4.5f, 16.5f)
            }
        }.build()

        return _CodeBracket!!
    }

@Suppress("ObjectPropertyName")
private var _CodeBracket: ImageVector? = null
