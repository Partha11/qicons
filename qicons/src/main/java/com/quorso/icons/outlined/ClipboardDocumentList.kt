package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ClipboardDocumentList: ImageVector
    get() {
        if (_ClipboardDocumentList != null) {
            return _ClipboardDocumentList!!
        }
        _ClipboardDocumentList = ImageVector.Builder(
            name = "Outlined.ClipboardDocumentList",
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
                moveTo(9f, 12f)
                horizontalLineToRelative(3.75f)
                moveTo(9f, 15f)
                horizontalLineToRelative(3.75f)
                moveTo(9f, 18f)
                horizontalLineToRelative(3.75f)
                moveToRelative(3f, 0.75f)
                lineTo(18f, 18.75f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, -2.25f)
                lineTo(20.25f, 6.108f)
                curveToRelative(0f, -1.135f, -0.845f, -2.098f, -1.976f, -2.192f)
                arcToRelative(48.424f, 48.424f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.123f, -0.08f)
                moveToRelative(-5.801f, 0f)
                curveToRelative(-0.065f, 0.21f, -0.1f, 0.433f, -0.1f, 0.664f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.1f, -0.664f)
                moveToRelative(-5.8f, 0f)
                arcTo(2.251f, 2.251f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 2.25f)
                lineTo(15f, 2.25f)
                curveToRelative(1.012f, 0f, 1.867f, 0.668f, 2.15f, 1.586f)
                moveToRelative(-5.8f, 0f)
                curveToRelative(-0.376f, 0.023f, -0.75f, 0.05f, -1.124f, 0.08f)
                curveTo(9.095f, 4.01f, 8.25f, 4.973f, 8.25f, 6.108f)
                lineTo(8.25f, 8.25f)
                moveToRelative(0f, 0f)
                lineTo(4.875f, 8.25f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(11.25f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                horizontalLineToRelative(9.75f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                lineTo(15.75f, 9.375f)
                curveToRelative(0f, -0.621f, -0.504f, -1.125f, -1.125f, -1.125f)
                lineTo(8.25f, 8.25f)
                close()
                moveTo(6.75f, 12f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(6.75f, 12.008f)
                lineTo(6.75f, 12f)
                close()
                moveTo(6.75f, 15f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(6.75f, 15.008f)
                lineTo(6.75f, 15f)
                close()
                moveTo(6.75f, 18f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(6.75f, 18.008f)
                lineTo(6.75f, 18f)
                close()
            }
        }.build()

        return _ClipboardDocumentList!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardDocumentList: ImageVector? = null
