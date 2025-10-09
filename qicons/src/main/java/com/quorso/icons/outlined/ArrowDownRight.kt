package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowDownRight: ImageVector
    get() {
        if (_ArrowDownRight != null) {
            return _ArrowDownRight!!
        }
        _ArrowDownRight = ImageVector.Builder(
            name = "Outlined.ArrowDownRight",
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
                moveToRelative(4.5f, 4.5f)
                lineToRelative(15f, 15f)
                moveToRelative(0f, 0f)
                verticalLineTo(8.25f)
                moveToRelative(0f, 11.25f)
                horizontalLineTo(8.25f)
            }
        }.build()

        return _ArrowDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownRight: ImageVector? = null
