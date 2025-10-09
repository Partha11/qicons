package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.CodeBracketSquare: ImageVector
    get() {
        if (_CodeBracketSquare != null) {
            return _CodeBracketSquare!!
        }
        _CodeBracketSquare = ImageVector.Builder(
            name = "Outlined.CodeBracketSquare",
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
                moveTo(14.25f, 9.75f)
                lineTo(16.5f, 12f)
                lineToRelative(-2.25f, 2.25f)
                moveToRelative(-4.5f, 0f)
                lineTo(7.5f, 12f)
                lineToRelative(2.25f, -2.25f)
                moveTo(6f, 20.25f)
                horizontalLineToRelative(12f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.25f, 18f)
                verticalLineTo(6f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 3.75f)
                horizontalLineTo(6f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.75f, 6f)
                verticalLineToRelative(12f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 20.25f)
                close()
            }
        }.build()

        return _CodeBracketSquare!!
    }

@Suppress("ObjectPropertyName")
private var _CodeBracketSquare: ImageVector? = null
